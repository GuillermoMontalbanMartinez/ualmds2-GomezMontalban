import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-rese�a`
 *
 * VistaRese�a element.
 *
 * @customElement
 * @polymer
 */
class VistaRese�a extends PolymerElement {

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
        return 'vista-rese�a';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRese�a.is, VistaRese�a);
