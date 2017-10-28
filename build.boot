(def project 'sole)
(def version "0.1.0-SNAPSHOT")

(set-env! :resource-paths #{"src"}
          :dependencies   '[[org.clojure/clojure "1.8.0" :scope "provided"]
                            [boot/core           "2.7.0" :scope "provided"]])

(task-options!
 pom {:project     project
      :version     version
      :description "A brief Boot un-framework."
      :url         "https://github.com/RadicalZephyr/sole"
      :scm         {:url "https://github.com/RadicalZephyr/sole"}
      :license     {"Eclipse Public License"
                    "http://www.eclipse.org/legal/epl-v10.html"}})

(deftask build
  "Build and install the project locally."
  []
  (comp (pom) (jar) (install)))
