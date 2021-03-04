import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaBuscarProductoAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
  <vaadin-text-field placeholder="Search" style="flex-shrink: 0; align-self: center; width: 50%;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-buscar-producto-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBuscarProductoAdmin.is, VistaBuscarProductoAdmin);
