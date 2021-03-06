import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaBannerRegistrado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0;">
  <vaadin-button theme="primary" id="principalButton" style="flex-grow: 0;">
    Principal 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-xl); width: 100%;">
  <vaadin-text-field placeholder="Search" id="buscardorTextField" style="width: 100%;" autofocus>
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing-s" style="flex-grow: 0; flex-shrink: 0; justify-content: center; width: 10%;">
  <vaadin-button theme="primary" style="align-self: center;" id="Correo">
    Correo 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; justify-content: center; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl); width: 10%;">
  <vaadin-button theme="primary" id="carritoButton">
    Carrito 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button theme="primary" style="align-self: center;" id="Perfil">
    Mi perfil 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-banner-registrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBannerRegistrado.is, VistaBannerRegistrado);
