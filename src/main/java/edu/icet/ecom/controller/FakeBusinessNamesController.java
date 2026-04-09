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

    @GetMapping("/addInformation")
    public NamesDto getInformation(NamesDto namesDto) {
        return fakeBusinessNameService.getInformation(namesDto);
    }

    @PostMapping("/calculateStatus")
    public boolean calculateStatus(String following, String likes) {
        return fakeBusinessNameService.calculateStatus(following, likes, namesDto.getFollowersCount());

    }

    public void getCountOfPosts(Integer posts) {

    }

}
