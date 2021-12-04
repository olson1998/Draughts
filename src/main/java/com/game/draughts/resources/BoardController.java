package com.game.draughts.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/board")
public class BoardController {

    @GetMapping
    public String[] getBoard(){
        Board board = new Board();
        return board.boardBuilder(1);
    }
}
