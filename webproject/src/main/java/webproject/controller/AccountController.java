package webproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import webproject.model.Account;
import webproject.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	/**
	  *  展示页面用
	 * @param model
	 * @return
	 */
	@GetMapping("/index")
	public String index(Model model) {
		List<Account> list = accountService.listservice();
		model.addAttribute("list",list);
		return "index";
	}
	
	/**
	  *  新增操作\至新增页面
	 * @param username
	 * @param password
	 * @param age
	 * @return
	 */
	@GetMapping("/xinzengaccount")
	public String insert(Model model) {
		Account account = new Account();
		model.addAttribute(account);
		return "xinzengaccount";
	}
	
	@PostMapping("/insert")
	public String insertbutton(Account account) {
		accountService.insertAccount(account);
		return "redirect:/index";
	}
	
	/**
	  *  删除用户重定向至展示页面
	 * @param id
	 * @return
	 */
	@DeleteMapping("/deleteaccount/{id}")
	public String delete(@PathVariable Integer id) {
		accountService.deleteAccount(id);
		return "redirect:/index";
	} 
	
	/**
	  *  账户修改\至修改页面
	 * @param account
	 * @return
	 */
	@GetMapping("/xiugaiaccount/{id}")
	public String put(@PathVariable Integer id , Model model) {
		Account account = accountService.selectservice(id);
		model.addAttribute(account);
		return "xiugaiaccount";
	}
	
	@PutMapping("/xiugaiaccount")
	public String xiugaizhanghao(Account account) {
		accountService.updateAccount(account);
		return "redirect:/index";
	}
	
	public static void main(String[] args) {
		int a = (int)(Math.random()*10000);
		System.out.println(a);
		
	}
	
}
