package com.example.demo.controller.order32;

import com.example.demo.entity.order32.Board;
import com.example.demo.service.order32.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/32th/board")
public class Fourth32thBoardController {

    @Autowired
    private BoardService boardService;

    // 33th
    // 사용자 URL 요청을 받음
    // list 페이지에서 글쓰기를 눌러도 연동됨
    @GetMapping("/register")
    //public String registerForm (Board board, Model model) {
    public String registerForm (Board board) {
    //public String registerForm () {
        log.info("registerForm");

        // HTML 페이지 띄움
        return "/32th/board/register";
    }

    // 33th
    // HTML 페이지에서 버튼 클릭에 의한 이벤트로 PostMapping 연동
    @PostMapping("/register")
    public String register (Board board, Model model) {
        log.info("DB register - board 정보: " + board);

        // DB 처리
        boardService.register(board);

        // 성공 메시지 보여줌
        return "/32th/board/success";
    }

    // 왜 한 번에 정리하려고 하면 말리는지 이해가 되실까요 ?
    // 당장 완벽하게 이해가 안되더라도 일단 급한 불부터 끕니다.
    //
    //   오늘        내일          조금 더 지난 후
    //  [   ]       [   ]            [     ]
    //              [   ]            [     ]
    //              [   ]            [     ]
    //                               [     ]
    //                               [     ]
    //                               [     ]
    //                               [     ]
    //                               [     ]
    //                               [     ]
    //                               [     ]
    //                               [     ]
    //                               [     ]
    //                               [     ]
    //                               [     ]
    //                               [     ]
    //                               [     ]
    //                               [     ]
    //                               [     ]

    // 32th
    // URL 요청해서 들어가면 나오는 페이지
    @GetMapping("/list")
    public String list (Model model) {
        log.info("list");

        // DB에 저장된 데이터를 읽어서 list 속성에 설정
        model.addAttribute("list", boardService.list());

        // HTML에서 전달된 list 속성을 배치하여 화면상에 보여줌
        // HTML 내부에는 글쓰기, 제목 눌렀을때 read 연동
        return "/32th/board/list";
    }

    // 33th
    // list에서 제목을 눌렀을 경우 연동됨
    @GetMapping("/read")
    public String read (int boardNo, Model model) {
        log.info("read");

        // 이렇게 적어놓지 않았을 경우엔
        // 리턴타입의 헝가리안 표기법으로 들어간다.
        // 즉 Board -> board
        // MemberAuth 라면 -> memberAuth 형태가되니 매우 주의해야함
        model.addAttribute(boardService.read(boardNo));

        return "/32th/board/read";
    }

    // 33th
    // read에서 수정하기 눌렀을 경우 연동
    @GetMapping("/modify")
    public String modifyForm (int boardNo, Model model) {
        log.info("modifyForm");

        // 현재 작성된 내용 연동 (데이터)
        model.addAttribute(boardService.read(boardNo));

        // 수정 페이지 HTML (화면)
        return "/32th/board/modify";
    }

    // 33th
    // modify HTML 페이지에서 수정하기 눌렀을 경우
    @PostMapping("/modify")
    public String modify (Board board, Model model) {
        log.info("modify");

        // DB에 내용 갱신
        boardService.modify(board);

        // 성공 메시지 출력
        return "/32th/board/success";
    }

    // 33th
    // 삭제 눌렀을 경우
    @PostMapping("/remove")
    public String remove (int boardNo, Model model) {
        log.info("remove");

        // DB에서 내용 삭제
        boardService.remove(boardNo);

        // 성공 메시지 출력
        return "/32th/board/success";
    }
}
