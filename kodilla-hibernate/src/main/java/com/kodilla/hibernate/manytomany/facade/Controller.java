package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Controller {
    private final CompanyDao repoCompany;
    private final EmployeeDao repoEmployee;

    public Controller(CompanyDao company, EmployeeDao employee) {
        this.repoCompany = company;
        this.repoEmployee = employee;
    }

    public List<Employee> searchForEmployeeByFragment() {
        return repoEmployee.searchForEmployee();
    }

    public List<Company> searchForCompanyByFragment() {
        return repoCompany.searchForCompany();
    }

    public void save(Company company) {
        repoCompany.save(company);
    }

    public void deleteAll() {
        repoCompany.deleteAll();
    }
}
