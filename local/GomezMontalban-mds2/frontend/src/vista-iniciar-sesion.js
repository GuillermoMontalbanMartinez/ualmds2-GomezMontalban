import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-iniciar-sesion`
 *
 * VistaIniciarSesion element.
 *
 * @customElement
 * @polymer
 */
class VistaIniciarSesion extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-iniciar-sesion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaIniciarSesion.is, VistaIniciarSesion);
