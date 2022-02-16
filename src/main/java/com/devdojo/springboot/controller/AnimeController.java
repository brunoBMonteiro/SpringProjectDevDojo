package com.devdojo.springboot.controller;

import com.devdojo.springboot.domain.Anime;
import com.devdojo.springboot.util.DateUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
public class AnimeController {
    /* Sem injeção de dependencias - agora imagine se tivesse que instanciar varios objetos
    private DateUtil dateUtil = new DateUtil();
     */

    @Autowired
    private DateUtil dateUtil;

    @GetMapping(path = "list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("DBZ"), new Anime("Bersek"));
    }

}
