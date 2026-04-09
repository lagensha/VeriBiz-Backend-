package edu.icet.ecom.service;

import edu.icet.ecom.dto.NamesDto;

public interface FakeBusinessNameService {
    NamesDto getInformation(NamesDto namesDto);

    String calculateStatus(NamesDto namesDto);

    void getCountOfPosts(Integer posts);
}
