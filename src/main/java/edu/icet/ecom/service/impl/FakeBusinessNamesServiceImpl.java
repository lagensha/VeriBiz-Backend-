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
        return namesDto;
    }

    @Override
    public String calculateStatus(NamesDto namesDto) {
       int followers=namesDto.getFollowersCount();
         int following=namesDto.getFollowingCount();

         int score=0;
            if(followers>1000 && following<500) {
                score+=2;
            }
            double ratio=(following==0)?0:(double) followers/following;
            if(ratio>2) {
                score+=3;
            }
            if(ratio <0.5) {
                score+=1;
            }
            if(followers<50){
                score+=1;
            }
            String result;
            if(score>=5) {
                result="This  business account is fake";
            }
            if (score>=3) {
                result="This business account is likely fake but can be start up";
            }
            else {
                result="This business account is likely real";
            }
        System.out.println(result);
            return result;

    }

    @Override
    public void getCountOfPosts(Integer posts) {

    }


}
