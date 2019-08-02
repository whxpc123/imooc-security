package com.imooc.security.domin;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public interface SimpleView{}
    public interface DetailView extends SimpleView{ }

    @JsonView(SimpleView.class)
    private String username;

    @JsonView(DetailView.class)
    private String password;

}
