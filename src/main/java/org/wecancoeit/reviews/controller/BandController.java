package org.wecancoeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.repo.BandRepository;

import javax.annotation.Resource;

@Controller
public class BandController {

    @Resource
    private BandRepository bandRepo;

    @RequestMapping("/bands")
    public String findAllBands(Model model){
        model.addAttribute("bandsModel", bandRepo.findAll());
        return "bandsTemplate";
    }

}
