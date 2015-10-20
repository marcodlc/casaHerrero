package edu.usmp.fia.taller.mallacurricular.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.usmp.fia.taller.common.dao.DAOFactory;
import edu.usmp.fia.taller.common.action.ActionServlet;
import edu.usmp.fia.taller.common.action.Default;
import edu.usmp.fia.taller.common.action.HttpMethod;
import edu.usmp.fia.taller.common.action.HttpMethodType;
import edu.usmp.fia.taller.common.action.RequireLogin;
import edu.usmp.fia.taller.common.bean.MallaCurricular.T_course;

/**
 * Servlet implementation class ListaCursosServlet
 */
@WebServlet("/ListaCursosTIServlet")
public class ListaCursosTIServlet extends ActionServlet {

	@Default
	@RequireLogin(true)
	@HttpMethod(HttpMethodType.GET)
	public void MostrarMallaTI() throws Exception {

		DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

		List<T_course> cursos11 = factory.getMallaCurricular().findAlTI();
		List<T_course> cursos = factory.getMallaCurricular().findAl1TI();
		List<T_course> cursos2 = factory.getMallaCurricular().findAl2TI();
		List<T_course> cursos3 = factory.getMallaCurricular().findAl3TI();
		List<T_course> cursos4 = factory.getMallaCurricular().findAl4TI();
		List<T_course> cursos5 = factory.getMallaCurricular().findAl5TI();
		List<T_course> cursos6 = factory.getMallaCurricular().findAl6TI();
		List<T_course> cursos7 = factory.getMallaCurricular().findAl7TI();
		List<T_course> cursos8 = factory.getMallaCurricular().findAl8TI();
		List<T_course> cursos9 = factory.getMallaCurricular().findAl9TI();
		List<T_course> cursos10 = factory.getMallaCurricular().findAl10TI();

		request.setAttribute("cursos", cursos);
		request.setAttribute("cursos2", cursos2);
		request.setAttribute("cursos3", cursos3);
		request.setAttribute("cursos4", cursos4);
		request.setAttribute("cursos5", cursos5);
		request.setAttribute("cursos6", cursos6);
		request.setAttribute("cursos7", cursos7);
		request.setAttribute("cursos8", cursos8);
		request.setAttribute("cursos9", cursos9);
		request.setAttribute("cursos10", cursos10);
		request.setAttribute("cursos11", cursos11);
		// response.sendRedirect("/MallaCurricular/listaCursosTI.jsp");
		request.getRequestDispatcher("MallaCurricular/listaCursosTI.jsp").forward(request, response);
	}

}
