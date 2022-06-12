package by.tovpenets.saverequest;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/check-request")
public class CheckRequestServlet extends HttpServlet {

    private static final String ORDER_TYPE = "order-type";

    private static final String ORDER_STATUS = "order-status";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if (req.getParameter(ORDER_TYPE).isEmpty() || req.getParameter(ORDER_STATUS).isEmpty())
            resp.sendRedirect(req.getContextPath());
        else
            resp.sendRedirect("success-order");
    }
}
