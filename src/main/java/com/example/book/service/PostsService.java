package com.example.book.service;

import com.example.book.domain.posts.PostsRepository;
import com.example.book.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    //필요한 final 변수명을 받아서 생성자로 만들고
    //서비스니까 서비스 어노테이션 붙여주고
    //파이널 변수로 레포지토리 받고 -> 파이널이니까 생성자 생성될 때 생성자 주입 될거고
    //@Transactional로 save트렌젝션 관리해주고

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
