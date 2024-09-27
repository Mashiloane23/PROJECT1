package mashpavck.pack3;




import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class rental {

@Autowired
    private userRep userRep;

    public List<person> getAuthor() {

        return userRep.findAll();
    }
    public List<person> gettitle(){
        return userRep.findAll();
    }
    public List<person> getBookbyAuthorandTittle(String Author, String Tittle) {
        return userRep.findByAuthorandTittle(Author, Tittle);
    }

    public person createUser(person user) {
        return userRep.save(user);
    }
    public person updateUser(Long id, person userDetails) {
        Optional<person> userOptional = userRep.findById(id);
        if (userOptional.isPresent()) {
            person user = userOptional.get();
            user.setAuthor(userDetails.getAuthor());
            user.setTitle(userDetails.getTitle());
            return userRep.save(user);
        }
        return null;
    }



    public void deleteUser(Long id) {
        userRep.deleteById(id);
    }



}




