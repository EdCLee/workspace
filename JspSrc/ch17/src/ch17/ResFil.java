package ch17;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
@WebFilter("/sub5/*")
public class ResFil implements Filter {
	public void destroy() {	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		ResponWrap rw = 
			new ResponWrap((HttpServletResponse) response);
		chain.doFilter(request, rw);
		rw.replace();
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}
}