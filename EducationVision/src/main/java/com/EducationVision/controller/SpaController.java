package com.EducationVision.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controller handles forwarding for the Single-Page Application (SPA).
 * It ensures that any direct navigation to a frontend route (e.g., /home, /courses)
 * is forwarded to the main index.html file, allowing the client-side
 * JavaScript router to handle the page display.
 */
@Controller
public class SpaController {

    /**
     * Forwards any request that is not for an API endpoint or a static file to the main index.html page.
     * The regular expression '[^\\.]*' matches any path that does not contain a dot,
     * which prevents it from catching requests for static assets like .js, .css, or images.
     *
     * @return A forward instruction to serve the index.html file.
     */
    @RequestMapping(value = { "/", "/{path:[^\\.]*}" })
    public String forward() {
        return "forward:/index.html";
    }
}
