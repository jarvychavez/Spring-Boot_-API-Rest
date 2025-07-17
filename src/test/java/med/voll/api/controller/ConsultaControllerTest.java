//package med.voll.api.controller;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.HttpStatus;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//class ConsultaControllerTest {
//
//    @Autowired
//    private MockMvc mvc;
//
//    @Test
//    @DisplayName("Deberia devolver http 400 cuando la request no tenga datos")
//    void reservar_escenario1() throws Exception {
//
//       var responce = mvc.perform(post("/consultas"))
//                .andReturn().getResponse();
//
//       assertThat(responce.getStatus()).isEqualTo(HttpStatus.BAD_REQUEST.value());
//    }
//}