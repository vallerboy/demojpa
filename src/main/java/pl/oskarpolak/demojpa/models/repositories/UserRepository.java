package pl.oskarpolak.demojpa.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.oskarpolak.demojpa.models.UserModel;


@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer> {
}
