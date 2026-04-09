package edu.icet.ecom.service;

import edu.icet.ecom.dto.NamesDto;

public interface FakeBusinessNameService {
    NamesDto getInformation(NamesDto namesDto);

    boolean calculateStatus();

    void getCountOfPosts(Integer posts);
}
