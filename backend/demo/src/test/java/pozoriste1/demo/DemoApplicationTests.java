package pozoriste1.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetAllRadniciEndpoint() throws Exception {
        mockMvc.perform(get("/radnici"))
               .andExpect(status().isOk())
               .andExpect(content().contentType("application/json")); // Ensure it returns JSON
    }
}
