ALTER TABLE books add BESTSELLER BOOLEAN;
DROP PROCEDURE IF EXISTS UpdateBestsellers;
DELIMITER $$
CREATE PROCEDURE UpdateBestsellers()
BEGIN
    DECLARE bookRents, id INT;
    DECLARE bestseller BOOLEAN;
    DECLARE finished INT DEFAULT 0;
    DECLARE all_book_IDs CURSOR FOR SELECT BOOK_ID FROM books;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET finished = 1;
        OPEN all_book_IDs;
    WHILE (finished = 0) DO
        FETCH all_book_IDs INTO id;
        IF (finished = 0) THEN
            SELECT COUNT(*) FROM rents WHERE BOOK_ID = id INTO bookRents;
            IF (bookRents > 2) THEN SET bestseller = TRUE; ELSE SET bestseller = FALSE; END IF;
            UPDATE books SET BESTSELLER = bestseller WHERE BOOK_ID = id;
            COMMIT;
        END IF;
    END WHILE;
CLOSE all_book_IDs;
END $$
DELIMITER ;
CALL UpdateBestsellers();
