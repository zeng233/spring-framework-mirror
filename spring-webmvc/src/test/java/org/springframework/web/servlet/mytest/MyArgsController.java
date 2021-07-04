package org.springframework.web.servlet.mytest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
public class MyArgsController {


	@RequestMapping("")
	public void myPath2(HttpServletResponse response) throws IOException {
		throw new IllegalStateException("test");
	}

	@RequestMapping("/bar")
	public void myPath3(HttpServletResponse response) throws IOException {
		response.getWriter().write("testX");
	}

	@ExceptionHandler
	public void myPath2(Exception ex, HttpServletResponse response) throws IOException {
		response.getWriter().write(ex.getMessage());
	}
}
