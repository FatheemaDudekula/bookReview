package com.mario.gtest.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AllExceptionDTO {
	private String msg;
	private String userInput;
	private String dateAndTime;

}
