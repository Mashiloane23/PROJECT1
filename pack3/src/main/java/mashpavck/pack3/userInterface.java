package mashpavck.pack3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/person")

public class userInterface {
@Autowired rental rent;

@GetMapping
public List<person> getAllAuthors() {
    return rent.getAuthor();
}
    @GetMapping("/search/Tittles")
    public List<person> getBooksByTittles(@RequestParam String Tittle) {
        return rent.gettitle();
    }

    @GetMapping("/search/AuthorAndTittle")
    public  List<person> getBooksByTittleAndAuthor(@RequestParam String Tittle,String Author){
    return  rent.getBookbyAuthorandTittle(Tittle,Author);
    }
}
