package com.vision.shoppingmall.category.controller;


import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import templates.category.model.request.CreateCategoryRequest;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    @GetMapping("")
    public String categories() {
        return "category/list";
    }

    @GetMapping("/new-category")
    public String newCategory(Model model) {
        model.addAttribute("modalTitle", "카테고리 등록하기");
        return "category/category-form";
    }

    @PostMapping("/new-category")
    public String newCategorySubmit(@ModelAttribute @Valid CreateCategoryRequest request, BindingResult result) {
        //1. 카테고리 생성 성공 시에 카테고리 목록 페이지로 리다이렉트
        //2. 카테고리 생성 실패 시에 오류 반환
    }
}
