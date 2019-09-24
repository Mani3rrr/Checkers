package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private BuyService buyService;
    private BuyRepository buyRepository;

    public ProductOrderService(final InformationService informationService, final BuyService buyService, final BuyRepository buyRepository) {
        this.informationService = informationService;
        this.buyService = buyService;
        this.buyRepository = buyRepository;
    }

    public BuyDto process(BuyRequest buyRequest){
        boolean isBought = buyService.buy(buyRequest.getUser(), buyRequest.getProduct());
        if (isBought) {
            informationService.send(buyRequest);
            buyRepository.newBuy(buyRequest.getUser(), buyRequest.getProduct());
            return new BuyDto(buyRequest.getUser(), buyRequest.getProduct(), true);
        }else {
            return new BuyDto(buyRequest.getUser(), buyRequest.getProduct(), true);
        }
    }
}

