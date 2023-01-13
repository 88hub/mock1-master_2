package mymock;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class Home {
    @RequestMapping("/")
    public Answer getInfo() {
        return new Answer("testAcc", "testPass");
    }

    @RequestMapping(value = "/", method= RequestMethod.POST)
        public Answer postInfo(@RequestBody Answer answer) {
            return new Answer(answer.getAccount(), new Date().toString());
        }
    }


