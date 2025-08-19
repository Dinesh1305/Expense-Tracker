package com.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Expense;

@RestController
public class ExpenseController {

	@PostMapping("addExpense")
	public String add(@RequestBody List<Expense> input)
	{
		System.out.println(input);
			return "done";
	}
	
}
