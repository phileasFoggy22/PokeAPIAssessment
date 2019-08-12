package com.qa.poke;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@Autowired
	SearchHistoryRepo repo;
	
	private String pokemonurl = "https://pokeapi.co/api/v2/";
	
	@RequestMapping("home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Home");
		return mv;
	}
	@RequestMapping("findPokemonName")
	public ModelAndView getPokemonName(@RequestParam String pokemonName)
	{
		//SearchHistory search = new SearchHistory(0, pokemonName, 0);
		//repo.save(search);
		ModelAndView mv = new ModelAndView("pokemon");
		System.out.println("pokemon:"+pokemonurl + "pokemon/"+pokemonName); 
		
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        Object pokemon = restTemplate.exchange(pokemonurl + "pokemon/"+pokemonName, HttpMethod.GET,entity,Object.class);
		mv.addObject("pokemon", pokemon);
		return mv;
	}
	@RequestMapping("findPokemonNumber")
	public ModelAndView getPokemonName(@RequestParam int pokemonNumber)
	{
		//SearchHistory search = new SearchHistory(0, pokemonName, 0);
		//repo.save(search);
		ModelAndView mv = new ModelAndView("pokemon");
		System.out.println("pokemon:"+pokemonurl + "pokemon/"+pokemonNumber); 
		
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        Object pokemon = restTemplate.exchange(pokemonurl + "pokemon/"+pokemonNumber, HttpMethod.GET,entity,Object.class);
		mv.addObject("pokemon", pokemon);
		return mv;
	}
}
