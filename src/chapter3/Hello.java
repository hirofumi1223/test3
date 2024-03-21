package chapter3;

import java.io.IOException;  //eclipseではimport文を自動追加
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/chapter3/hello"})  //記述個所はサーブレットのクラス定義直前、ここではコンテキストルートで指定
public class Hello extends HttpServlet {    //サーブレットはサブクラスとして定義して、doget(post)にオーバーライドして処理内容を実行

	public void doGet (

		HttpServletRequest request, HttpServletResponse response  //リクエストとレスポンスを引数としてアプリケーションサーバでインスタンス化
	) throws ServletException, IOException {					  //throw文により例外を発生させるP52.53
		PrintWriter out=response.getWriter();					  //getwriterによりレスポンスの出力ストリームを取得する。(printwriterオブジェクトに格納する)
		out.println("Hello!");									  //出力ストリームにHello!を入力する。
		out.println(new java.util.Date());						  //出力ストリームに日付等を入力する。
	}

}
