package org.lc.video.controller;

import org.lc.video.model.Video;
import org.lc.video.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class VideoController {


    @Autowired
    private IVideoService videoService;


    @RequestMapping("videos/all")
    public String allVideo(Model model){

        List<Video> videoList = videoService.findAllVideo();
        model.addAttribute("videoList",videoList);

        System.out.println("-------->查询到的视频：");
        for (Video teacher :
                videoList) {
            System.out.println(teacher.getTitle());
        }
        return "admin/video";
    }
}
