package dev.resoup.home.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HomeControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	@WithMockUser
	public void test() throws Exception {
		mockMvc.perform(get("/home")
				.accept(MediaType.TEXT_HTML)
				/*.with(user("aaa").password("111"))*/)
			.andExpect(status().isOk())
			.andExpect(view().name("home"))
			.andDo(print());
	}
	
	@Test
	public void my() throws Exception {
//		mockMvc.perform(get("/home/my"))
//			.andExpect(status().isOk())
//			.andExpect(view().name("home/my"))
//			.andDo(print());
	}

}
