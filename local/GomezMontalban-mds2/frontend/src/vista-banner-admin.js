import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaBannerAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;background-color: #e6ffe6; border-radius: 20px; border : 1px solid black;" id="vaadinVerticalLayoutBannerAdmin">
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; width: 100%; align-self: center; align-items: center; justify-content: center;">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; align-self: center; flex-shrink: 0;"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" theme="primary" id="vaadinButtonAdministrarCategorias">
      Administrar categorías 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;"></vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <vaadin-button style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; width: 100%;" theme="primary" id="vaadinButtonAdministrarProductos">
       Administrar productos 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;"></vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m); align-items: center; justify-content: center;">
     <vaadin-button style="width: 100%; margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" theme="primary" id="vaadinButtonAdministrarOfertas">
       Administrar ofertas 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;"></vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <vaadin-button style="width: 100%; margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" theme="primary" id="vaadinButtonAdministrarCuentas">
       Administrar cuentas 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);"></vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button style="flex-shrink: 0; align-self: center; width: 100%; margin: var(--lumo-space-m);" theme="primary" id="vaadinButtonPrincipal">
       Principal 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;"></vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-items: center; justify-content: center; align-self: center; flex-shrink: 0;">
     <vaadin-button style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0;" theme="primary" id="vaadinButtonCorreo">
       Correo 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-items: center; justify-content: center; align-self: center;">
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;"></vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
     <vaadin-button style="margin: var(--lumo-space-m); width: 100%; align-self: center; flex-shrink: 0;" theme="primary" id="vaadinButtonListadoDeCompras">
       Listado de compras 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);"></vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
     <vaadin-button style="margin: var(--lumo-space-m); width: 100%; flex-shrink: 0; align-self: center;" theme="primary" id="vaadinButtonCerrarSesión">
       Cerrar sesión 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-banner-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBannerAdmin.is, VistaBannerAdmin);
