package edu.miu.cs545.aop.repo;

import edu.miu.cs545.aop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserRepository extends JpaRepository<User, Integer> {

}


Controller:
@GetMapping("/getByPrice")//
public List<Item> getByPriceGreaterThan(@RequestParam(name = "price") int price){
        return productService.findAllByPriceGreaterThan((double) price);
}
@GetMapping("/filter")
public List<Users> findUsersByItemNameAndPrice(@RequestParam (name="name") String name, @RequestParam(name="price")double price)

Repo:
List<Item> findAllByPriceGreaterThan(Double price);

@Query("select u from item i join i.id_user u where i.name = ?1 and i.price >?2")
    List<Users> findUsersByItemNameAndPrice(String name,Double price);