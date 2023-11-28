package com.sergio.jwt.backend.services.impl;

import com.sergio.jwt.backend.entites.cloth.Category;
import com.sergio.jwt.backend.entites.cloth.Product;
import com.sergio.jwt.backend.repositories.CategoryRepository;
import com.sergio.jwt.backend.repositories.ProductRepository;
import com.sergio.jwt.backend.services.FillUpService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FillUpServiceImpl implements FillUpService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public FillUpServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void fillUpDataBase() {

        Category jeans = new Category("jeans", "Джинсы");
        Category jackets = new Category("jackets", "Куртки");
        Category coat = new Category("coat", "Пальто");
        Category skirts = new Category("skirts", "Юбки");

        /*ДЖИНСЫ*/

        Product highRiseJeans = new Product(
                "ДЖИНСЫ HIGH RISE",
                "https://static.zara.net/photos///2023/I/0/2/p/8062/320/802/2/w/1126/8062320802_1_1_1.jpg?ts=1695971085292",
                2100,
                10,
                jeans
        );

        Product splitJeans = new Product(
                "ДЖИНСЫ SPLIT",
                "https://static.zara.net/photos///2023/I/0/2/p/3175/307/506/2/w/1126/3175307506_1_1_1.jpg?ts=1689609802675",
                1100,
                100,
                jeans
        );

        Product fittedJeans = new Product(
                "БАЗОВЫЕ ДЖИНСЫ ОБЛЕГАЮЩЕГО КРОЯ",
                "https://static.zara.net/photos///2023/I/0/1/p/1538/382/427/2/w/1126/1538382427_1_1_1.jpg?ts=1689249148712",
                2000,
                69,
                jeans);

        Product croppedJeans = new Product(
                "ДЖИНСЫ CROPPED X RHUIGI",
                "https://static.zara.net/photos///2023/I/0/2/p/1538/322/802/2/w/1126/1538322802_1_1_1.jpg?ts=1692960481484",
                3400,
                7,
                jeans
        );

        /*КУРТКИ*/

        Product oversizedDenimJacket = new Product(
                "ДЖИНСОВАЯ КУРТКА-РУБАШКА В СТИЛЕ OVERSIZE",
                "https://static.zara.net/photos///2023/I/0/2/p/2878/306/500/2/w/1226/2878306500_2_4_1.jpg?ts=1700647188472",
                990,
                20,
                jackets
        );

        Product basicDenimJacket = new Product(
                "БАЗОВАЯ ДЖИНСОВАЯ КУРТКА",
                "https://static.zara.net/photos///2023/I/0/2/p/3286/511/710/2/w/742/3286511710_2_1_1.jpg?ts=1699457610600",
                780,
                15,
                jackets
        );

        Product quiltedJacket = new Product(
                "БАЗОВАЯ СТЕГАНАЯ КУРТКА",
                "https://static.zara.net/photos///2023/I/0/2/p/0993/404/400/2/w/742/0993404400_2_1_1.jpg?ts=1697800100951",
                1100,
                10,
                jackets
        );

        /*ПАЛЬТО*/

        Product fauxShearlingCoat = new Product(
                "ДВУБОРТНОЕ ПАЛЬТО ИЗ ИСКУССТВЕННОЙ ОВЧИНЫ",
                "https://static.zara.net/photos///2023/I/0/2/p/9621/333/401/2/w/1226/9621333401_1_1_1.jpg?ts=1701097941919",
                1200,
                100,
                coat
        );

        Product woolBlendCoat = new Product(
                "ДВУБОРТНОЕ ПАЛЬТО ИЗ СМЕСОВОЙ ШЕРСТИ",
                "https://static.zara.net/photos///2024/V/0/2/p/4020/398/800/2/w/1226/4020398800_1_1_1.jpg?ts=1701097822607",
                700,
                50,
                coat
        );

        Product checkeredCoat = new Product(
                "ДВУБОРТНОЕ ПАЛЬТО В КЛЕТКУ",
                "https://static.zara.net/photos///2024/V/0/2/p/5854/270/064/2/w/1226/5854270064_1_1_1.jpg?ts=1700214824309",
                850,
                60,
                coat
        );

        /*ЮБКИ*/

        Product satinMidiSkirt = new Product(
                "АТЛАСНАЯ ЮБКА МИДИ",
                "https://static.zara.net/photos///2024/V/0/1/p/9337/031/251/2/w/1226/9337031251_2_5_1.jpg?ts=1700832126689",
                900,
                50,
                skirts
        );

        categoryRepository.saveAll(List.of(jeans, jackets, coat, skirts));
        productRepository.saveAll(List.of(highRiseJeans, splitJeans, fittedJeans, croppedJeans,
                oversizedDenimJacket, basicDenimJacket, quiltedJacket, fauxShearlingCoat, woolBlendCoat, checkeredCoat, satinMidiSkirt));

    }
}
