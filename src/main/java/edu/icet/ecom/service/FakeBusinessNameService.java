package edu.icet.ecom.service;

import edu.icet.ecom.dto.NamesDto;

public interface FakeBusinessNameService {
    NamesDto getInformation(NamesDto namesDto);

    boolean calculateStatus(String following, String likes, String followers);

    void getCountOfPosts(Integer posts);
}
