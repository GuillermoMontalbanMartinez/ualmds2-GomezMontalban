import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

class VistaCategorias extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; border: #ccc solid 2px; border-radius : 5px;
">
 <vaadin-list-box>
  <b style="align-self: center;">Categorias</b>
  <vaadin-item>
    Item one 
  </vaadin-item>
  <vaadin-item>
    Item two 
  </vaadin-item>
  <hr>
  <vaadin-item>
    Item three 
  </vaadin-item>
  <vaadin-item>
    Item four 
  </vaadin-item>
 </vaadin-list-box>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-categorias';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCategorias.is, VistaCategorias);
