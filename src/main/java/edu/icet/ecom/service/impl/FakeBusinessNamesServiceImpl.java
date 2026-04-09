package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.NamesDto;
import edu.icet.ecom.service.FakeBusinessNameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FakeBusinessNamesServiceImpl implements FakeBusinessNameService {
    @Override
    public NamesDto getInformation(NamesDto namesDto) {
        namesDto.setUserName(namesDto.getUserName());
        namesDto.setFollowingCount(namesDto.getFollowingCount());
        namesDto.setFollowingCount(namesDto.getLikes());
        return namesDto;
    }

    @Override
    public boolean calculateStatus() {
        NamesDto namesDto = new NamesDto();
        int following = Integer.parseInt(namesDto.getFollowingCount());
        int likes = Integer.parseInt(namesDto.getLikes());
        int followers = Integer.parseInt(namesDto.getFollowersCount());

        if (following > 1000 && followers < 100) {
            return true;
        }
        if (followers > 500 && likes < 100) {
            return true;
        }
        if (followers != 0) {
            double ratio = (double) following / followers;
            if (ratio > 10) {
                return true;
            }
        }
        namesDto.setAccountFake(true);
        return namesDto.isAccountFake();
    }

    @Override
    public void getCountOfPosts(Integer posts) {

    }


}
