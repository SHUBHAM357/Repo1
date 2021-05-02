package com.shubham;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.shubham.model.Employee;

public class EmployeeFieldSetMapper implements FieldSetMapper<Employee> {

	public Employee mapFieldSet(FieldSet fieldSet) throws BindException {

		Employee employee = new Employee();
		employee.setEmployeeId(fieldSet.readString(0));
		employee.setEmployeeName(fieldSet.readString(1));
		return employee;

	}

}