package recozilla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import recozilla.dto.RecozillaDto;
import recozilla.service.RecozillaService;

@Component
@RequestMapping("/")
public class RecozillaController {

@Autowired
    RecozillaService service;

@PostMapping("create")
public String  onSubmit(RecozillaDto recozillaDto, Model model){
model.addAttribute("account",recozillaDto);
service.validateTheAccount(recozillaDto);
    return "response.jsp";
}
}
