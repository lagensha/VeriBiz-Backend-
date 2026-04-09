package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.NamesDto;
import edu.icet.ecom.repository.FakeBusinessNamesInterfaceInterface;


public class FakeBusinessNamesServiceImpl implements FakeBusinessNamesInterfaceInterface {
    @Override
    public NamesDto getInformation() {
        return null;
    }

    @Override
    public Integer calculateStatus(Integer following, Integer likes) {
        return 0;
    }

    @Override
    public void getCountOfPosts(Integer posts) {

    }

    @Override
    public int checkEngagementRisk(double engagement) {
        return 0;
    }
}
