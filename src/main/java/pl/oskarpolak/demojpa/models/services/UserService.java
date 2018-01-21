package pl.oskarpolak.demojpa.models.services;

import org.springframework.stereotype.Service;

//@Controller/Serivce/Component/Bean/Configuration/Repository
@Service
public class UserService {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
