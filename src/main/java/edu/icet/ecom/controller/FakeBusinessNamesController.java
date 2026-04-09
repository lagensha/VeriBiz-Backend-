package edu.icet.ecom.controller;

import edu.icet.ecom.dto.NamesDto;
import edu.icet.ecom.service.FakeBusinessNameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/FakeBusinessNames")
public class FakeBusinessNamesController {

    private NamesDto namesDto = new NamesDto();

    final FakeBusinessNameService fakeBusinessNameService;

    @PostMapping("/addInformation")
    public NamesDto getInformation(NamesDto namesDto) {
        return fakeBusinessNameService.getInformation(namesDto);
    }

    @PostMapping("/calculateStatus")
    public void calculateStatus(NamesDto namesDto) {
        fakeBusinessNameService.calculateStatus(namesDto);

    }

    public void getCountOfPosts(Integer posts) {

    }

}
