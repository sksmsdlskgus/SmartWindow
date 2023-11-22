package smwindow.smart.Controller;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import smwindow.smart.Entity.MainEntity;
import smwindow.smart.Service.MainService;
import smwindow.smart.Vo.MainVo;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/smart")

public class MainController {

    private final MainService mainService;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/Main")
    public List<MainVo> getMain() {
        List<MainEntity> mainEntities = mainService.findstatus();
        List<MainVo> MainArr = new ArrayList<MainVo>();
        for (MainEntity mainEntity : mainEntities) {
            MainVo mainVo = new MainVo();
            mainVo.setId(mainEntity.getId());
            mainVo.setHumi(mainEntity.getHumi());
            mainVo.setTemp(mainEntity.getTemp());
            mainVo.setRaindrops_status(mainEntity.getRaindrops_status());

            MainArr.add(mainVo);
        }
        return MainArr;
    }

//    @PostMapping("/Main")
//    public int openwindow() {
//        //아두이노에 http 통신을 통해서 스텝모터작동
//    }
//    //if(프론트에서 보낸값이 == 1) {
//    // 아두이노랑 통신해서 스텝모터 동작하는 코드
//    //  if(아두이노가 동작을 완료하면 주는 값 == true) {
//    //   프론트한테 다시 작동완료 보내주기
//    //  }
//    // }


}
