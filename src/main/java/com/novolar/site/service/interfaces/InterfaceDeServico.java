package com.novolar.site.service.interfaces;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface InterfaceDeServico {
	String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
