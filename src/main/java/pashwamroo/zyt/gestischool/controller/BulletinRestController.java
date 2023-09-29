package pashwamroo.zyt.gestischool.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pashwamroo.zyt.gestischool.entity.Bulletin;
import pashwamroo.zyt.gestischool.exceptions.EleveNotFoundException;
import pashwamroo.zyt.gestischool.service.BulletinService;

@RestController
@RequestMapping("/api/bulletin")
public class BulletinRestController {

    private final BulletinService bulletinService;

    public BulletinRestController(BulletinService bulletinService) {
        this.bulletinService = bulletinService;
    }

    @GetMapping("/{eleveId}")
    public Bulletin generateBulletin(@PathVariable Long eleveId) throws EleveNotFoundException {
        return null; 
        //bulletinService.genererLeBulletinDUnEleve(eleveId); 
    }
}
