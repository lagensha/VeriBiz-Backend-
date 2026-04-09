package edu.icet.ecom.repository;

import edu.icet.ecom.dto.NamesDto;

public interface FakeBusinessNamesInterface {
    NamesDto getInformation();
    boolean calculateStatus();
    void getCountOfPosts(Integer posts);
}
