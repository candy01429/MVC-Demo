package com.controller;

import com.model.MyModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyController", urlPatterns = {"/MyController"})
public class MyController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 由request物件中使用getParameter()方法取出瀏覽器置入的name參數值
        String name = request.getParameter("name"); 
        MyModel model = new MyModel(); // 建立model物件
        model.setName(name); // 將取出的name參數值傳入以進行商業邏輯分析運算
        request.setAttribute("model", model); // 將model放入request物件中,資料交換
        
        // 使用RequestDispatcher物件進行執行權交換,由controller轉發給view
        // model物件所含資料將一併藉由request物件轉發
        RequestDispatcher rd = request.getRequestDispatcher("myView.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
