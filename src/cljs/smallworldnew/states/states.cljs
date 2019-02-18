(ns smallworldnew.states.states
  (:require [reagent.core :as reagent :refer [atom]]))

(def accordionData (atom [
                          {   :id 1
                              :title "What is a dog?"
                              :desc "A dog is a type of domesticated animal. Known for its loyalty and faithfulness, it can be found as a welcome guest in many households across the world.",
                              :active true}
                          {   :id 2
                              :title "What is a dog?"
                              :desc "A dog is a type of domesticated animal. Known for its loyalty and faithfulness, it can be found as a welcome guest in many households across the world.",
                              :active false}]))
(def mobileView (atom {:view false}))

(def aboutone (atom [ {
                       :id 1
                       :type 1
                       :title "What is SmallWorld"
                       :desc "What is it like to run a business in Estonia? How to benefit from the e-solutions and the efficiency of our business culture? What are the opportunities in specific sectors?"
                       :image "/images/banner-3.png"}
                      { :id 2
                        :type 0
                        :title "Investment Portfolio"
                        :desc "What is it like to run a business in Estonia? How to benefit from the e-solutions and the efficiency of our business culture? What are the opportunities in specific sectors?"
                        :image "/images/banner-4.png"}]))

(def wedoData (atom [
                      { :id 1
                        :type 1
                        :title "Building Startup Community"
                        :desc "What is it like to run a business in Estonia? How to benefit from the e-solutions and the efficiency of our business culture? What are the opportunities in specific sectors?"
                        :image "/images/startup-com.png"
                        :modal false}
                      { :id 2
                        :type 0
                        :title "Investment Portfolio "
                        :desc "What is it like to run a business in Estonia? How to benefit from the e-solutions and the efficiency of our business culture? What are the opportunities in specific sectors?"
                        :image "/images/investment.png"
                        :link "googlo.com"
                        :modal false}
                      { :id 3
                        :type 1
                        :title "Internal Venture Building"
                        :desc "What is it like to run a business in Estonia? How to benefit from the e-solutions and the efficiency of our business culture? What are the opportunities in specific sectors?"
                        :image "/images/venture-building.png"
                        :link "googlo.com"
                        :modal false}
                      { :id 4
                        :type 0
                        :title "Long-term Investment Reforest Cambodia"
                        :desc "What is it like to run a business in Estonia? How to benefit from the e-solutions and the efficiency of our business culture? What are the opportunities in specific sectors?"
                        :image "/images/reforest.png"
                        :modal false}]))



(def navData (atom  [ { :id 1
                        :name "About"
                        :path "/about"}
                      {:id 2
                        :name "What We Can Do"
                        :path "/wedo"}
                      {:id 3
                        :name "News & Events"
                        :path "#"}
                      {:id 4
                        :name "Contact Us"
                        :path "/contact"}]))
