CREATE INDEX BOOK_IDX ON books (TITLE);
CREATE INDEX READER_IDX ON readers (FIRSTNAME, LASTNAME);
EXPLAIN SELECT COUNT(*) FROM readers WHERE FIRSTNAME = 'John';