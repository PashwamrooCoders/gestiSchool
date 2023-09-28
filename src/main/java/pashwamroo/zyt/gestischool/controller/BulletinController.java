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
public class BulletinController {

    private final BulletinService bulletinService;

    public BulletinController(BulletinService bulletinService) {
        this.bulletinService = bulletinService;
    }

    @GetMapping("/{eleveId}")
    public Bulletin generateBulletin(@PathVariable Long eleveId) throws EleveNotFoundException {
        return bulletinService.generateBulletin(eleveId);
    }
}
